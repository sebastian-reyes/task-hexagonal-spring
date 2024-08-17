package com.sreyes.tasks.domain.ports.in;

import com.sreyes.tasks.domain.model.Task;

import java.util.List;
import java.util.Optional;

public interface RetrieveTaskUseCase {
    Optional<Task> getTask(String taskId);
    List<Task> getAllTasks();
}
