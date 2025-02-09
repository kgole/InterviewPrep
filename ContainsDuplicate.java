import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        if(nums.length == 0 || nums.length == 1)
            return false;

        Set<Integer> numsSet = new HashSet<>();

        for(int num : nums){
            if(numsSet.contains(num))
                return true;
            numsSet.add(num);
        }

        return false;
    }
}
