package com.newbiest.commom.sm;

import liquibase.integration.spring.SpringLiquibase;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Slf4j
@Component
public class StatusMachineConfiguration {

    /**
     * 默认的LiquibaseBean
     * @param dataSource
     * @return
     * @throws Exception
     */
    @Bean("statusMachineLiquibase")
    public SpringLiquibase liquibase(DataSource dataSource) throws Exception{
        if (log.isInfoEnabled()) {
            log.info("Load StatusMachine Liquibase Configuration.");
        }
        SpringLiquibase liquibase = new SpringLiquibase();
        liquibase.setDataSource(dataSource);
        liquibase.setChangeLog("classpath:db/changelog/db.changelog-statusmachine.yaml");
        liquibase.setShouldRun(true);
        liquibase.setDropFirst(false);
        return liquibase;
    }
    
}
