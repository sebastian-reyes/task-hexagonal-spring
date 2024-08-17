package com.sreyes.tasks.application.usecases;

import com.sreyes.tasks.domain.model.Task;
import com.sreyes.tasks.domain.ports.in.RetrieveTaskUseCase;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class RetrieveTaskUseCaseImpl implements RetrieveTaskUseCase {

    private final RetrieveTaskUseCaseImpl retrieveTaskUseCase;

    @Override
    public Optional<Task> getTask(Long taskId) {
        return retrieveTaskUseCase.getTask(taskId);
    }

    @Override
    public List<Task> getAllTasks() {
        return retrieveTaskUseCase.getAllTasks();
    }
}
