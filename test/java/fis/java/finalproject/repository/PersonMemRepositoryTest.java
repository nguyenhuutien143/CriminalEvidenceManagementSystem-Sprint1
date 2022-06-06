package fis.java.finalproject.repository;

import fis.java.finalproject.model.Person;
import fis.java.finalproject.repository.mem.PersonMemRepository;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class PersonMemRepositoryTest {

    @Test
    void insertOrUpdate() {
        PersonMemRepository personMemRepository=PersonMemRepository.getInstance();
        Person p1= new Person(1,1, LocalDateTime.now(),LocalDateTime.now(), "Tien NH",
                "Tien", "NH","pass",LocalDateTime.now());
        Person p2= new Person(2,1, LocalDateTime.now(),LocalDateTime.now(), "Tien NH",
                "Tien", "NH","pass",LocalDateTime.now());

        personMemRepository.insertOrUpdate(p1);
        personMemRepository.insertOrUpdate(p2);

        assertEquals(2, personMemRepository.findAll().size());
    }

    @Test
    void findById() {
        PersonMemRepository personMemRepository=PersonMemRepository.getInstance();
        Person p1= new Person(1,1, LocalDateTime.now(),LocalDateTime.now(), "Tien NH",
                "Tien", "NH","pass",LocalDateTime.now());
        Person p2= new Person(2,1, LocalDateTime.now(),LocalDateTime.now(), "Tien NH",
                "Tien", "NH","pass",LocalDateTime.now());

        personMemRepository.insertOrUpdate(p1);
        personMemRepository.insertOrUpdate(p2);

        assertEquals(1, personMemRepository.findById(1L).getId());
    }

    @Test
    void findAll() {
        PersonMemRepository personMemRepository=PersonMemRepository.getInstance();
        Person p1= new Person(1,1, LocalDateTime.now(),LocalDateTime.now(), "Tien NH",
                "Tien", "NH","pass",LocalDateTime.now());
        Person p2= new Person(2,1, LocalDateTime.now(),LocalDateTime.now(), "Tien NH",
                "Tien", "NH","pass",LocalDateTime.now());

        personMemRepository.insertOrUpdate(p1);
        personMemRepository.insertOrUpdate(p2);

        assertEquals(2,personMemRepository.findAll().size());
    }

    @Test
    void deleteById() {
        PersonMemRepository personMemRepository=PersonMemRepository.getInstance();
        Person p1= new Person(1,1, LocalDateTime.now(),LocalDateTime.now(), "Tien NH",
                "Tien", "NH","pass",LocalDateTime.now());
        Person p2= new Person(2,1, LocalDateTime.now(),LocalDateTime.now(), "Tien NH",
                "Tien", "NH","pass",LocalDateTime.now());

        personMemRepository.insertOrUpdate(p1);
        personMemRepository.insertOrUpdate(p2);
        personMemRepository.deleteById(1L);

        assertEquals(1,personMemRepository.findAll().size());
    }
}