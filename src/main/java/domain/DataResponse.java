package domain;

import java.io.Serializable;

/**
 * Created by ripato on 14/03/2018.
 */
public class DataResponse<T> implements Serializable {
    private String kdSts;
    private String ketSts;
    private String msg;
    private T data;

    public DataResponse() {

        this.kdSts = "1";
    }

    public String getKdSts() {
        return kdSts;
    }

    public void setKdSts(String kdSts) {
        this.kdSts = kdSts;
    }

    public String getKetSts() {
        return ketSts;
    }

    public void setKetSts(String ketSts) {
        this.ketSts = ketSts;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
