package com.x.processplatform.assemble.surface.jaxrs.applicationdict;

import com.x.base.core.project.exception.PromptException;

class ExceptionApplicationDictNotExist extends PromptException {

	private static final long serialVersionUID = -5954915325716358186L;

	ExceptionApplicationDictNotExist(String flag) {
		super("标识为:" + flag + ", 的数据字典不存在");
	}

}
