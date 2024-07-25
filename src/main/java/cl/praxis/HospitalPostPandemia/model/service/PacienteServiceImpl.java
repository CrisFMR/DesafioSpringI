package cl.praxis.HospitalPostPandemia.model.service;

import cl.praxis.HospitalPostPandemia.model.dto.Paciente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PacienteServiceImpl implements PacienteService{

    private List<Paciente> pacienteList;

    public PacienteServiceImpl() {
        pacienteList = new ArrayList<>();
        pacienteList.add(new Paciente(1, "Marina", "Contreras", "24-04-1987", "987748214", "Av.Chile 2411, Maipu", "25-04-2024"));
        pacienteList.add(new Paciente(2, "Matias", "Calderon", "07-01-1979", "994832001", "Rondizonni 457 dpto 24, Santiago", "29-02-2024"));
        pacienteList.add(new Paciente(3, "Ricardo", "Maureira", "03-05-1996", "955847992", "Av.Sur 487, Maipu", "01-03-2024"));
        pacienteList.add(new Paciente(4, "Yasmin", "Vasquez", "13-11-1991", "994257844", "Laguna Sur 369, Pudahuel", "15-02-2024"));
        pacienteList.add(new Paciente(5, "Angeles", "Tapia", "06-07-1985", "942159870", "Manquehue 1158 torre sur dpto 358, Las Condes", "30-06-2024"));
    }

    public PacienteServiceImpl(List<Paciente> pacienteList) {
        this.pacienteList = pacienteList;
    }

    @Override
    public List<Paciente> findAll() {
        return pacienteList;
    }

    @Override
    public Paciente findOne(int id) {
        return null;
    }

    @Override
    public boolean create(Paciente b) {
        return false;
    }

    @Override
    public boolean update(Paciente b) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
