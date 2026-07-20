package net.engineeringdigest.journalApp.controller;


import net.engineeringdigest.journalApp.controller.entity.JournalEntry;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class JournalEnteryController {

    private Map<Long, JournalEntry>  journalEntries = new HashMap<>();

     public List<JournalEntry> getAll(){
     return  new ArrayList<>(journalEntries.values());

     }
}
