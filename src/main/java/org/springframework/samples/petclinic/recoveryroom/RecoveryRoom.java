package org.springframework.samples.petclinic.recoveryroom;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

import org.springframework.samples.petclinic.model.NamedEntity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class RecoveryRoom extends NamedEntity {
	
	@NotNull
    @PositiveOrZero
    double size;
    
	@NotNull
    boolean secure;
	
    @Transient
    RecoveryRoomType roomType;
    
    @ManyToOne
    RecoveryRoomType recoveryRoomType;
}
