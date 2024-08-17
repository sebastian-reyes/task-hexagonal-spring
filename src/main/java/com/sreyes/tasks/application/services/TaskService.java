package com.sreyes.tasks.application.services;

import com.sreyes.tasks.domain.model.AdditionalTaskInfo;
import com.sreyes.tasks.domain.model.Task;
import com.sreyes.tasks.domain.ports.in.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class TaskService implements CreateTaskUseCase, DeleteTaskUseCase, UpdateTaskUseCase,
        GetAdditionalTaskInfoUseCase, RetrieveTaskUseCase {

    private final CreateTaskUseCase createTaskUseCase;
    private final DeleteTaskUseCase deleteTaskUseCase;
    private final UpdateTaskUseCase updateTaskUseCase;
    private final GetAdditionalTaskInfoUseCase getAdditionalTaskInfoUseCase;
    private final RetrieveTaskUseCase retrieveTaskUseCase;

    @Override
    public Task createTask(Task task) {
        return createTaskUseCase.createTask(task);
    }

    @Override
    public boolean deleteTask(Long taskId) {
        return deleteTaskUseCase.deleteTask(taskId);
    }

    @Override
    public AdditionalTaskInfo getAdditionalTaskInfo(Long taskId) {
        return getAdditionalTaskInfoUseCase.getAdditionalTaskInfo(taskId);
    }

    @Override
    public Optional<Task> getTask(Long taskId) {
        return retrieveTaskUseCase.getTask(taskId);
    }

    @Override
    public List<Task> getAllTasks() {
        return retrieveTaskUseCase.getAllTasks();
    }

    @Override
    public Optional<Task> updateTask(Long taskId, Task updateTask) {
        return updateTaskUseCase.updateTask(taskId, updateTask);
    }
}
