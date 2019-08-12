package ac.za.cput.repository;

import ac.za.cput.domain.Gender;

import java.util.Set;

public interface GenderRepository extends InterfaceRepository<Gender, String> {

    Set<Gender> getAll();
}
