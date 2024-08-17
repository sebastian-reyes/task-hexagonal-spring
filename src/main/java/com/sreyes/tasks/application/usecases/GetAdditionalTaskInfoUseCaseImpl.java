package com.sreyes.tasks.application.usecases;

import com.sreyes.tasks.domain.model.AdditionalTaskInfo;
import com.sreyes.tasks.domain.ports.in.GetAdditionalTaskInfoUseCase;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class GetAdditionalTaskInfoUseCaseImpl implements GetAdditionalTaskInfoUseCase {

    private final GetAdditionalTaskInfoUseCase getAdditionalTaskInfoUseCase;

    @Override
    public AdditionalTaskInfo getAdditionalTaskInfo(Long taskId) {
        return getAdditionalTaskInfoUseCase.getAdditionalTaskInfo(taskId);
    }
}
