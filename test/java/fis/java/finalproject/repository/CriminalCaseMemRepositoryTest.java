package fis.java.finalproject.repository;

import fis.java.finalproject.model.CriminalCase;
import fis.java.finalproject.repository.mem.CriminalCaseMemRepository;
import fis.java.finalproject.util.CaseStatus;
import fis.java.finalproject.util.CaseType;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class CriminalCaseMemRepositoryTest {

    @Test
    void insertOrUpdate() {
        CriminalCaseMemRepository criminalCaseMemRepository= CriminalCaseMemRepository.getInstance();
        CriminalCase c1= new CriminalCase(1, 1, LocalDateTime.now(), LocalDateTime.now(), "1",
                CaseType.FELONY,"shortDescription", CaseStatus.CLOSED, "notes",
                null, null, null) ;
        CriminalCase c2= new CriminalCase(2, 1, LocalDateTime.now(), LocalDateTime.now(), "1",
                CaseType.FELONY,"shortDescription", CaseStatus.CLOSED, "notes",
                null, null, null) ;
        CriminalCase c3= new CriminalCase(3, 1, LocalDateTime.now(), LocalDateTime.now(), "1",
                CaseType.FELONY,"shortDescription", CaseStatus.CLOSED, "notes",
                null, null, null) ;

        criminalCaseMemRepository.insertOrUpdate(c1);
        criminalCaseMemRepository.insertOrUpdate(c2);
        criminalCaseMemRepository.insertOrUpdate(c3);

        assertEquals(3,criminalCaseMemRepository.findAll().size());
    }

    @Test
    void findById() {
        CriminalCaseMemRepository criminalCaseMemRepository= CriminalCaseMemRepository.getInstance();
        CriminalCase c1= new CriminalCase(1, 1, LocalDateTime.now(), LocalDateTime.now(), "1",
                CaseType.FELONY,"shortDescription", CaseStatus.CLOSED, "notes",
                null, null, null) ;
        CriminalCase c2= new CriminalCase(2, 1, LocalDateTime.now(), LocalDateTime.now(), "1",
                CaseType.FELONY,"shortDescription", CaseStatus.CLOSED, "notes",
                null, null, null) ;
        CriminalCase c3= new CriminalCase(3, 1, LocalDateTime.now(), LocalDateTime.now(), "1",
                CaseType.FELONY,"shortDescription", CaseStatus.CLOSED, "notes",
                null, null, null) ;

        criminalCaseMemRepository.insertOrUpdate(c1);
        criminalCaseMemRepository.insertOrUpdate(c2);

        assertEquals(1L,criminalCaseMemRepository.findById(1L).getId());
    }

    @Test
    void findAll() {
        CriminalCaseMemRepository criminalCaseMemRepository= CriminalCaseMemRepository.getInstance();
        CriminalCase c1= new CriminalCase(1, 1, LocalDateTime.now(), LocalDateTime.now(), "1",
                CaseType.FELONY,"shortDescription", CaseStatus.CLOSED, "notes",
                null, null, null) ;
        CriminalCase c2= new CriminalCase(2, 1, LocalDateTime.now(), LocalDateTime.now(), "1",
                CaseType.FELONY,"shortDescription", CaseStatus.CLOSED, "notes",
                null, null, null) ;
        CriminalCase c3= new CriminalCase(3, 1, LocalDateTime.now(), LocalDateTime.now(), "1",
                CaseType.FELONY,"shortDescription", CaseStatus.CLOSED, "notes",
                null, null, null) ;

        criminalCaseMemRepository.insertOrUpdate(c1);
        criminalCaseMemRepository.insertOrUpdate(c2);
        assertEquals(2,criminalCaseMemRepository.findAll().size());
    }

    @Test
    void deleteById() {
        CriminalCaseMemRepository criminalCaseMemRepository= CriminalCaseMemRepository.getInstance();
        CriminalCase c1= new CriminalCase(1, 1, LocalDateTime.now(), LocalDateTime.now(), "1",
                CaseType.FELONY,"shortDescription", CaseStatus.CLOSED, "notes",
                null, null, null) ;
        CriminalCase c2= new CriminalCase(2, 1, LocalDateTime.now(), LocalDateTime.now(), "1",
                CaseType.FELONY,"shortDescription", CaseStatus.CLOSED, "notes",
                null, null, null) ;
        CriminalCase c3= new CriminalCase(3, 1, LocalDateTime.now(), LocalDateTime.now(), "1",
                CaseType.FELONY,"shortDescription", CaseStatus.CLOSED, "notes",
                null, null, null) ;

        criminalCaseMemRepository.insertOrUpdate(c1);
        criminalCaseMemRepository.insertOrUpdate(c2);
        criminalCaseMemRepository.deleteById(1L);

        assertEquals(1,criminalCaseMemRepository.findAll().size());
    }
}