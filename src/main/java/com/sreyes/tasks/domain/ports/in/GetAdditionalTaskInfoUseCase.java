package com.sreyes.tasks.domain.ports.in;

import com.sreyes.tasks.domain.model.AdditionalTaskInfo;

public interface GetAdditionalTaskInfoUseCase {
    AdditionalTaskInfo getAdditionalTaskInfo(Long taskId);
}
