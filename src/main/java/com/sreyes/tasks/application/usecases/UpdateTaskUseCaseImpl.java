package com.sreyes.tasks.application.usecases;

import com.sreyes.tasks.domain.model.Task;
import com.sreyes.tasks.domain.ports.in.UpdateTaskUseCase;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
public class UpdateTaskUseCaseImpl implements UpdateTaskUseCase {

    private final UpdateTaskUseCaseImpl updateTaskUseCase;

    @Override
    public Optional<Task> updateTask(Long taskId, Task updateTask) {
        return updateTaskUseCase.updateTask(taskId, updateTask);
    }
}
