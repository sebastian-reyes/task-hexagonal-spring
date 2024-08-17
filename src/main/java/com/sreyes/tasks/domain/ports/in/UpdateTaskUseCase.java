package com.sreyes.tasks.domain.ports.in;

import com.sreyes.tasks.domain.model.Task;

import java.util.Optional;

public interface UpdateTaskUseCase {
    Optional<Task> updateTask(Long taskId, Task updateTask);
}
