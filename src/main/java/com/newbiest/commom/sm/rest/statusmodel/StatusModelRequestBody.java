package com.newbiest.commom.sm.rest.statusmodel;

import com.newbiest.base.msg.RequestBody;
import com.newbiest.commom.sm.model.StatusModel;
import lombok.Data;

/**
 * Created by guoxunbo on 2017/9/29.
 */
@Data
public class StatusModelRequestBody extends RequestBody {
	
	private static final long serialVersionUID = 1L;
	
	private String actionType;

	private StatusModel statusModel;

}
