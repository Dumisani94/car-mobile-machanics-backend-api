package za.ac.tut.car.mobile.machanics.services;

import org.springframework.stereotype.Service;
import za.ac.tut.car.mobile.machanics.enities.Incident;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DashboardServiceImpl implements DashboardService {

    private final IncidentService incidentService;

    public DashboardServiceImpl(IncidentService incidentService) {
        this.incidentService = incidentService;
    }

    @Override
    public Map<String, String> enquireDashboardInfo() {

        List<Incident> incidents = incidentService.retrieveAll();
        Map<String , String> info = new HashMap<>();
        int countRejected = 0;
        int countFailed = 0;
        int countPaid = 0;
        int countPending = 0;

        if(incidents != null){
            if(!incidents.isEmpty()){
                for(Incident incident: incidents){
                    if(incident.getStatus().equals("PAID")){
                        countPaid += 1;
                        info.put("PAID",String.valueOf(countPaid));
                    }else if(incident.getStatus().equals("PENDING")){
                        countPending += 1;
                        info.put("PENDING",String.valueOf(countPending));
                    }else if(incident.getStatus().equals("REJECTED")){
                        countRejected += 1;
                        info.put("REJECTED",String.valueOf(countRejected));

                    }else if(incident.getStatus().equals("FAILED")){
                        countFailed += 1;
                        info.put("FAILED",String.valueOf(countFailed));
                    }
                }
            }
        }
        return info;
    }
}
