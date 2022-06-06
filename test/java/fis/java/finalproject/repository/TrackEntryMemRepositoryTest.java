package fis.java.finalproject.repository;

import fis.java.finalproject.model.TrackEntry;
import fis.java.finalproject.repository.mem.TrackEntryMemRepository;
import fis.java.finalproject.util.TrackAction;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class TrackEntryMemRepositoryTest {

    @Test
    void insertOrUpdate() {
        TrackEntryMemRepository trackEntryMemRepository= TrackEntryMemRepository.getInstance();
        TrackEntry t1= new TrackEntry(1, 1, LocalDateTime.now(), LocalDateTime.now()
        , LocalDateTime.now(),null, null, TrackAction.RETRIEVED, "reason");
        TrackEntry t2= new TrackEntry(2, 1, LocalDateTime.now(), LocalDateTime.now()
                , LocalDateTime.now(),null, null, TrackAction.RETRIEVED, "reason");
        TrackEntry t3= new TrackEntry(3, 1, LocalDateTime.now(), LocalDateTime.now()
                , LocalDateTime.now(),null, null, TrackAction.RETRIEVED, "reason");

        trackEntryMemRepository.insertOrUpdate(t1);
        trackEntryMemRepository.insertOrUpdate(t2);
        trackEntryMemRepository.insertOrUpdate(t3);

        assertEquals(3,trackEntryMemRepository.findAll().size());
    }

    @Test
    void findById() {
        TrackEntryMemRepository trackEntryMemRepository= TrackEntryMemRepository.getInstance();
        TrackEntry t1= new TrackEntry(1, 1, LocalDateTime.now(), LocalDateTime.now()
                , LocalDateTime.now(),null, null, TrackAction.RETRIEVED, "reason");
        TrackEntry t2= new TrackEntry(2, 1, LocalDateTime.now(), LocalDateTime.now()
                , LocalDateTime.now(),null, null, TrackAction.RETRIEVED, "reason");
        TrackEntry t3= new TrackEntry(3, 1, LocalDateTime.now(), LocalDateTime.now()
                , LocalDateTime.now(),null, null, TrackAction.RETRIEVED, "reason");

        trackEntryMemRepository.insertOrUpdate(t1);
        trackEntryMemRepository.insertOrUpdate(t2);
        trackEntryMemRepository.insertOrUpdate(t3);

        assertEquals(1L,trackEntryMemRepository.findById(1L).getId());
    }

    @Test
    void findAll() {
        TrackEntryMemRepository trackEntryMemRepository= TrackEntryMemRepository.getInstance();
        TrackEntry t1= new TrackEntry(1, 1, LocalDateTime.now(), LocalDateTime.now()
                , LocalDateTime.now(),null, null, TrackAction.RETRIEVED, "reason");
        TrackEntry t2= new TrackEntry(2, 1, LocalDateTime.now(), LocalDateTime.now()
                , LocalDateTime.now(),null, null, TrackAction.RETRIEVED, "reason");
        TrackEntry t3= new TrackEntry(3, 1, LocalDateTime.now(), LocalDateTime.now()
                , LocalDateTime.now(),null, null, TrackAction.RETRIEVED, "reason");

        trackEntryMemRepository.insertOrUpdate(t1);
        trackEntryMemRepository.insertOrUpdate(t2);
        trackEntryMemRepository.insertOrUpdate(t3);

        assertEquals(3,trackEntryMemRepository.findAll().size());
    }

    @Test
    void deleteById() {
        TrackEntryMemRepository trackEntryMemRepository= TrackEntryMemRepository.getInstance();
        TrackEntry t1= new TrackEntry(1, 1, LocalDateTime.now(), LocalDateTime.now()
                , LocalDateTime.now(),null, null, TrackAction.RETRIEVED, "reason");
        TrackEntry t2= new TrackEntry(2, 1, LocalDateTime.now(), LocalDateTime.now()
                , LocalDateTime.now(),null, null, TrackAction.RETRIEVED, "reason");
        TrackEntry t3= new TrackEntry(3, 1, LocalDateTime.now(), LocalDateTime.now()
                , LocalDateTime.now(),null, null, TrackAction.RETRIEVED, "reason");

        trackEntryMemRepository.insertOrUpdate(t1);
        trackEntryMemRepository.insertOrUpdate(t2);
        trackEntryMemRepository.insertOrUpdate(t3);
        trackEntryMemRepository.deleteById(1L);

        assertEquals(2,trackEntryMemRepository.findAll().size());
    }
}