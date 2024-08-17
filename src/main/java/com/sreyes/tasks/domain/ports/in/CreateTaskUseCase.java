package com.sreyes.tasks.domain.ports.in;

import com.sreyes.tasks.domain.model.Task;

public interface CreateTaskUseCase {
    Task createTask(Task task);
}
