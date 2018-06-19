package walkrank.service;
import org.springframework.stereotype.Service;
import walkrank.model.Output;

@Service
public class WalkService {

    public Output hello(){
        Output res = new Output();
        res.setHello("hello world");
        return res;
    }
}
