package club.ndt.oauth.boot.response;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author ndt
 * @create time  2018/3/30 20:37
 * @description
 * @modify
 * @modify time
 */
@Getter
@Setter
public class PageAndSortResponse extends BaseResponse {

    private Integer currentPage;
    private Integer pageSize;
    private long count;
    List items;

    protected PageAndSortResponse(){}

}
