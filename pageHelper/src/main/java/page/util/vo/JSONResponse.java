package page.util.vo;


import lombok.Data;

@Data
public class JSONResponse {

	private boolean success;
    private String message;
    private Object data;
    private String code;
}
