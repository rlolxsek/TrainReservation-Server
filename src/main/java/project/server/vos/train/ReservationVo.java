package project.server.vos.train;

import lombok.Data;

import project.server.entities.train.ReservationEntity;



@Data
public class ReservationVo extends ReservationEntity {
    private Integer trainNo;
    private Integer carriage;
    private String seat;
    private String age;
    private Integer price;
    private Integer discountedPrice;
    private Integer ticketCnt;
    private String ticketId;
    private String formattedCreatedDate;
    private String formattedExpiredDate;

}
