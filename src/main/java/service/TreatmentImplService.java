package service;


import entity.Treatment;
import jakarta.jws.WebService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@WebService(endpointInterface = "service.TreatmentService")
public class TreatmentImplService implements TreatmentService {
    private final List<Treatment> treatment;
    private long id;
    {
        treatment = new ArrayList<>();
        treatment.add(new Treatment(1, "Грипп", "Терафлю"));
        treatment.add(new Treatment(2, "Ветрянка", "Зелёнка"));
        treatment.add(new Treatment(3, "Аллергия", "Лекарства от аллергии"));
        treatment.add(new Treatment(4, "Аппендицит", "Антибиотики"));
        treatment.add(new Treatment(5, "Гастрит", "Антацидные средства"));
    }

    public TreatmentImplService() {
    }

    @Override
    public List<Treatment> getAll() {
        return treatment;
    }


    @Override
    public List<Treatment> getByDisease(String disease) {
        return treatment
                .stream()
                .filter(treatment -> treatment.getDisease() == disease)
                .collect(Collectors.toList());
    }

    @Override
    public List<Treatment> getByMedicine(String medicine) {
        return treatment
                .stream()
                .filter(treatment -> treatment.getMedicine() == medicine)
                .collect(Collectors.toList());
    }
}