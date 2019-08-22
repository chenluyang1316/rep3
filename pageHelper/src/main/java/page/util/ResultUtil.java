package page.util;

import page.enums.ResError;
import page.enums.ResSuccess;
import page.util.vo.JSONResponse;

public class ResultUtil {

	/**
	 * 默认返回成功
	 * 
	 * @return JSONResponse
	 */
	public static JSONResponse success() {
		return success(new String());
	}

	/**
	 * 返回成功及数据
	 * 
	 * @param resSuccess
	 * @return JSONResponse
	 */
	public static JSONResponse success(Object object) {
		return success(ResSuccess.SYS_200, object);
	}

	/**
	 * 返回成功信息
	 * 
	 * @param resSuccess
	 * @return JSONResponse
	 */
	public static JSONResponse success(ResSuccess resSuccess) {
		return success(resSuccess, null);
	}

	/**
	 * 返回成功信息及结果
	 * 
	 * @param resSuccess
	 * @param object
	 * @return JSONResponse
	 */
	public static JSONResponse success(ResSuccess resSuccess, Object object) {
		JSONResponse jsonResponse = new JSONResponse();
		jsonResponse.setSuccess(true);
		jsonResponse.setData(object);
		jsonResponse.setCode(resSuccess.getCode());
		jsonResponse.setMessage(resSuccess.getMessage());
		return jsonResponse;
	}

	/**
	 * 返回信息
	 * 
	 * @param message
	 * @return JSONResponse
	 */
	public static JSONResponse success(String message) {
		return success(ResSuccess.SYS_200.getCode(), message, null);
	}

	/**
	 * 自定义编码和返回信息
	 * 
	 * @param code
	 * @param message
	 * @return JSONResponse
	 */
	public static JSONResponse success(String code, String message) {
		return success(code, message, null);
	}

	/**
	 * 自定义编码、返回信息和数据
	 * 
	 * @param code
	 * @param message
	 * @param object
	 * @return JSONResponse
	 */
	public static JSONResponse success(String code, String message, Object object) {
		JSONResponse jsonResponse = new JSONResponse();
		jsonResponse.setSuccess(true);
		jsonResponse.setData(object);
		jsonResponse.setCode(code);
		jsonResponse.setMessage(message);
		return jsonResponse;
	}

	/**
	 * 返回失败信息
	 * 
	 * @param resError
	 * @return JSONResponse
	 */
	public static JSONResponse error(ResError resError) {
		return error(resError, null);
	}

	/**
	 * 返回失败信息及结果
	 * 
	 * @param resError
	 * @param object
	 * @return JSONResponse
	 */
	public static JSONResponse error(ResError resError, Object object) {
		JSONResponse jsonResponse = new JSONResponse();
		jsonResponse.setSuccess(false);
		jsonResponse.setData(object);
		jsonResponse.setCode(resError.getCode());
		jsonResponse.setMessage(resError.getMessage());
		return jsonResponse;
	}

	/**
	 * 自定义返回失败信息
	 * 
	 * @param message
	 * @return JSONResponse
	 */
	public static JSONResponse error(String message) {
		return error(ResError.SYS_500.getCode(), message, null);
	}

	/**
	 * 自定义返回失败编码信息
	 * 
	 * @param code
	 * @param message
	 * @return
	 */
	public static JSONResponse error(String code, String message) {
		return error(message, null);
	}

	/**
	 * 自定义返回编码信息及数据
	 * 
	 * @param message
	 * @param object
	 * @return JSONResponse
	 */
	public static JSONResponse error(String code, String message, Object object) {
		JSONResponse jsonResponse = new JSONResponse();
		jsonResponse.setSuccess(false);
		jsonResponse.setData(object);
		jsonResponse.setCode(code);
		jsonResponse.setMessage(message);
		return jsonResponse;
	}
}
