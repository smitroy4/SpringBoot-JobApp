package com.smit.JobApp.service;

import com.smit.JobApp.model.JobPost;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class JobService {

    private JobService service;

    public void addJob(){
    service.addJob();
    }
    public List<JobPost> getAllJobs(){
    return service.getAllJobs();
    }
}
