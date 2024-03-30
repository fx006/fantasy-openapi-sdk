package icu.qimuu.qiapisdk.model.response;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: QiMu
 * @Date: 2023/08/17 09:14:26
 * @Version: 1.0
 * @Description: 通用返回类
 */
@Data
@NoArgsConstructor
public class ResultResponse implements Serializable {
    private static final long serialVersionUID = -6486005224268968744L;
    private Map<String, Object> data = new HashMap<>();

    @JsonAnyGetter
    //(注解的作用：用于序列化时获取 Map 类型数据的注解。在这里，用于告知序列化器将 data 字段作为 Map 来序列化。)
    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }
}