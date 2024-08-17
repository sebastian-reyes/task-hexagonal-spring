package com.sreyes.tasks.application.usecases;

import com.sreyes.tasks.domain.ports.in.DeleteTaskUseCase;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DeleteTaskUseCaseImpl implements DeleteTaskUseCase {

    private final DeleteTaskUseCaseImpl deleteTaskUseCase;

    @Override
    public boolean deleteTask(Long taskId) {
        return deleteTaskUseCase.deleteTask(taskId);
    }
}
