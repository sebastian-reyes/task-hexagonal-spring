package com.sreyes.tasks.domain.ports.out;

import com.sreyes.tasks.domain.model.AdditionalTaskInfo;

public interface ExternalServicePort {
    AdditionalTaskInfo getAdditionalTaskInfo(Long taskId);
}
