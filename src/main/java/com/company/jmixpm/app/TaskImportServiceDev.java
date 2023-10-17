package com.company.jmixpm.app;

import com.company.jmixpm.entity.Project;
import com.company.jmixpm.entity.Task;
import io.jmix.core.DataManager;
import io.jmix.core.EntitySet;
import io.jmix.core.SaveContext;
import org.apache.commons.lang3.RandomStringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.annotation.Nullable;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component("TaskImportServiceDev")
@Profile("dev")
public class TaskImportServiceDev implements TaskImportService{

    private static final Logger log = LoggerFactory.getLogger(TaskImportServiceDev.class);

    private final DataManager dataManager;

    public TaskImportServiceDev(DataManager dataManager) {
        this.dataManager = dataManager;
    }

    public int importTask() {

        return -1;
    }

}