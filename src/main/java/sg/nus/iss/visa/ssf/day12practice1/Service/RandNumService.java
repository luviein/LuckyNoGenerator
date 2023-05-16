package sg.nus.iss.visa.ssf.day12practice1.Service;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class RandNumService {
    public List<Integer> generateRandNumbers(int number) {
        return new Random().ints(1 , 31).distinct().limit(number).boxed().collect(Collectors.toList());
        
    }
}
