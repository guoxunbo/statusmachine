package com.newbiest.commom.sm.service;

import com.newbiest.base.exception.ClientException;
import com.newbiest.commom.sm.model.StatusLifeCycle;
import com.newbiest.commom.sm.model.StatusModel;

/**
 * Created by guoxunbo on 2018/8/10.
 */
public interface StatusMachineService {

    StatusModel getStatusModelByObjectRrn(String objectRrn) throws ClientException;
    StatusModel getStatusModelByName(String name) throws ClientException;

    StatusModel saveStatusModel(StatusModel statusModel) throws ClientException;

    StatusLifeCycle triggerEvent(StatusLifeCycle statusLifeCycle, String eventId, String targetStatus) throws ClientException;
}
