package za.ac.tut.car.mobile.machanics.services;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public interface DashboardService {
    Map<String, String> enquireDashboardInfo();
}
