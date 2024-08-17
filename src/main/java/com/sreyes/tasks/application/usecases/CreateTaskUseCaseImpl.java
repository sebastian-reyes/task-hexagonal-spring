package com.sreyes.tasks.application.usecases;

import com.sreyes.tasks.domain.model.Task;
import com.sreyes.tasks.domain.ports.in.CreateTaskUseCase;
import com.sreyes.tasks.domain.ports.out.TaskRepositoryPort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CreateTaskUseCaseImpl implements CreateTaskUseCase {

    private final TaskRepositoryPort taskRepositoryPort;

    @Override
    public Task createTask(Task task) {
        return taskRepositoryPort.save(task);
    }
}
