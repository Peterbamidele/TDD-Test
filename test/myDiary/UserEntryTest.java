package myDiary;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class UserEntryTest {


    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void UserEntry_hasTitleAfterConstruction() {
        //given
        UserEntry userEntry;
        //when
        userEntry = new UserEntry("My First Entry");

        //assert
        String entryTitle = userEntry.getEntryTitle();
        assertEquals("My First Entry", entryTitle);
    }

    @Test
    void userEntry_hasDateAndTimeOfEntryAfterConstruction() {
        //given}
        UserEntry userEntry;
        // when
        userEntry = new UserEntry("My First Entry");

        assertNotNull(userEntry.getDateAndTimeOfEntry());

    }
    @Test
    void dateAndTimeOfEntry_isCurrentAfterEntryCreation(){
        //given
        UserEntry userEntry = new UserEntry("New User Entre");
        //when
        LocalDateTime entryDateAndTime = userEntry.getEntryDateAndTimeOfEntry();
        LocalDate entryDate = entryDateAndTime.toLocalDate();
        LocalDate curerentDte = LocalDate .now();
        //assert
        assertEquals(curerentDte,entryDate);

    }
    
    @Test
    void userEntryTitle_canBeChanged(){
        //given
        UserEntry userEntry = new UserEntry("Old Entry Title");
        //when
        userEntry.updateEntryTitle("New Entry Title");
        //assert
        String entryTitle = userEntry.getEntryTitle();
        assertEquals("New Entry Title", entryTitle);
    }

    @Test
    void userEntryBody_canBeUpdated(){
        //given
        UserEntry userEntry = new UserEntry("Entry Title");
        //when
        userEntry.updateEntryBody("Entry Body");
        //assert
        String entryBody = userEntry.getEntryBody();
        assertNotNull(entryBody);
        assertEquals("Entry Body", entryBody);
    }

}
