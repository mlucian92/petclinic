package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Speciality;
import org.springframework.stereotype.Service;

@Service
public interface SpecialtiesService extends CrudService<Speciality, Long> {
}
