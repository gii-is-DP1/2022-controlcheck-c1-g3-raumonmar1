package org.springframework.samples.petclinic.recoveryroom;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RecoveryRoomService {
	
	private final RecoveryRoomRepository recoveryRoomRepository;
	
    public List<RecoveryRoom> getAll(){
        return recoveryRoomRepository.findAll();
    }

    public List<RecoveryRoomType> getAllRecoveryRoomTypes(){
        return null;
    }

    public RecoveryRoomType getRecoveryRoomType(String name) {
        return recoveryRoomRepository.getRecoveryRoomType(name);
    }

    public RecoveryRoom save(RecoveryRoom p) {
        return recoveryRoomRepository.save(p);       
    }
}
