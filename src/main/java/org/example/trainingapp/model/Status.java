package org.example.trainingapp.model;

import jakarta.validation.constraints.Min;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Status {

    @Min(value = 1, message = "Target should be at least 1")
    private int target;
    private int counter = 0;
    private TaskStatus taskStatus = TaskStatus.UNSTARTED;

    public Status() {
        this.target = 0;
    }

    public Status(int target) {
        this.target = target;
    }

    @Override
    public String toString() {
        return counter + "/" + target;
    }

    enum TaskStatus{
        UNSTARTED, INPROGRESS, DONE
    }
}
