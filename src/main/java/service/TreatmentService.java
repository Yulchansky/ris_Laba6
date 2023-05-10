package service;

import entity.Treatment;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public interface TreatmentService {
    List<Treatment> getAll();
    List<Treatment> getByDisease(String disease);
    List<Treatment> getByMedicine(String medicine);
}
