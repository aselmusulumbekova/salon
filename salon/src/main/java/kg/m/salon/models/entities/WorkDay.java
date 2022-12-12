package kg.m.salon.models.entities;

import kg.m.salon.models.entities.Master;
import kg.m.salon.models.enums.WorkDayStatus;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Setter
@Getter
@Entity
@Table(name = "tb_work_day", uniqueConstraints = {@UniqueConstraint(columnNames = {"end_date", "status", "start_date"})})
public class WorkDay {
    @Id
    @GeneratedValue
    Long id;
    @Temporal(TemporalType.TIME)
    @Column(name = "start_date")
    Date startDate;
    @Temporal(TemporalType.TIME)
    @Column(name = "end_date")
    Date endDate;
    @ManyToMany
    @JoinTable(
            name = "tb_work_day_master",
            joinColumns = {@JoinColumn(name = "work_day_id")},
            inverseJoinColumns = {@JoinColumn(name = "master_id")})
    List<Master> masterId;
    @Column(name = "status")
    WorkDayStatus status;

}
