package ru.dmitriikotiashov.model;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;
import ru.dmitriikotiashov.entities.Doctor;

import java.io.IOException;
import java.util.List;

/**
 * Created by Дмитрий on 02.12.2018.
 */
public class DoctorModel {

    RestTemplate restTemplate = new RestTemplate();
    ObjectMapper objectMapper = new ObjectMapper();

    public static final String SERVER = "http://localhost:";
    public static final String PORT = "8088";
    public static final String GET_ALL_DOCTORS = "/doctorManager/doctors";
    public static final String GET_DOCTOR = "/doctorManager/doctor/{id}";

    public List<Doctor> getDoctors() {
        TypeReference<List<Doctor>> typeReference = new TypeReference<List<Doctor>>(){};
        try {
            return objectMapper.readValue(
                    restTemplate.exchange(SERVER+PORT+GET_ALL_DOCTORS, HttpMethod.GET, null, String.class).getBody(),
                    typeReference);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Doctor getDoctorById(String id){
        try {
            return objectMapper.readValue(
                    restTemplate.exchange(SERVER+PORT+GET_DOCTOR, HttpMethod.GET, null, String.class, id).getBody(),
                    Doctor.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
