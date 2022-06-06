package fis.java.finalproject.repository;

import fis.java.finalproject.model.Detective;
import fis.java.finalproject.repository.mem.DetectiveMemRepository;
import fis.java.finalproject.util.EmploymentStatus;
import fis.java.finalproject.util.Rank;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class DetectiveMemRepositoryTest {

    @Test
    void insertOrUpdate() {
        DetectiveMemRepository detectiveMemRepository= DetectiveMemRepository.getInstance();
        Detective d1= new Detective(1 , 1, LocalDateTime.now(), LocalDateTime.now(), null,
                null, Rank.ACTIVE, true, EmploymentStatus.ACTIVE,null, null);
        Detective d2= new Detective(2 , 1, LocalDateTime.now(), LocalDateTime.now(), null,
                null, Rank.ACTIVE, true, EmploymentStatus.ACTIVE,null, null);

        detectiveMemRepository.insertOrUpdate(d1);
        detectiveMemRepository.insertOrUpdate(d2);

        assertEquals(2, detectiveMemRepository.findAll().size());
    }

    @Test
    void findById() {
        DetectiveMemRepository detectiveMemRepository= DetectiveMemRepository.getInstance();
        Detective d1= new Detective(1 , 1, LocalDateTime.now(), LocalDateTime.now(), null,
                null, Rank.ACTIVE, true, EmploymentStatus.ACTIVE,null, null);
        Detective d2= new Detective(2 , 1, LocalDateTime.now(), LocalDateTime.now(), null,
                null, Rank.ACTIVE, true, EmploymentStatus.ACTIVE,null, null);

        detectiveMemRepository.insertOrUpdate(d1);
        detectiveMemRepository.insertOrUpdate(d2);

        assertEquals(1l, detectiveMemRepository.findById(1l).getId());
    }

    @Test
    void findAll() {
        DetectiveMemRepository detectiveMemRepository= DetectiveMemRepository.getInstance();
        Detective d1= new Detective(1 , 1, LocalDateTime.now(), LocalDateTime.now(), null,
                null, Rank.ACTIVE, true, EmploymentStatus.ACTIVE,null, null);
        Detective d2= new Detective(2 , 1, LocalDateTime.now(), LocalDateTime.now(), null,
                null, Rank.ACTIVE, true, EmploymentStatus.ACTIVE,null, null);

        detectiveMemRepository.insertOrUpdate(d1);
        detectiveMemRepository.insertOrUpdate(d2);

        assertEquals(2,detectiveMemRepository.findAll().size());
    }

    @Test
    void deleteById() {
        DetectiveMemRepository detectiveMemRepository= DetectiveMemRepository.getInstance();
        Detective d1= new Detective(1 , 1, LocalDateTime.now(), LocalDateTime.now(), null,
                null, Rank.ACTIVE, true, EmploymentStatus.ACTIVE,null, null);
        Detective d2= new Detective(2 , 1, LocalDateTime.now(), LocalDateTime.now(), null,
                null, Rank.ACTIVE, true, EmploymentStatus.ACTIVE,null, null);

        detectiveMemRepository.insertOrUpdate(d1);
        detectiveMemRepository.insertOrUpdate(d2);
        detectiveMemRepository.deleteById(1L);

        assertEquals(1,detectiveMemRepository.findAll().size());
    }
}