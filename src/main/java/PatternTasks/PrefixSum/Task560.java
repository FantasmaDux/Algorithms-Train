package PatternTasks.PrefixSum;

import java.util.HashMap;

/*
put(key, value) - Положить значение по ключу, если ключ уже есть, перезапишет
get(key) - Получить значение по ключу, если ключа нет → вернёт null
containsKey(key) - Проверяет, есть ли ключ
getOrDefault(key, defaultValue) - Если ключ есть → вернёт значение, если нет → вернёт defaultValue
 */

public class Task560 {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 1, 1};
        int k = 2;
        System.out.println(subarraySum(arr, k));
    }

    public static int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> prefixMap = new HashMap<>();
        prefixMap.put(0, 1); //чтобы первым элементом был 0. Без этого элемента не будет учитываться
                                // нулевой элемент в исходном массиве. 1 - потому что сумма 0 встретилась 1 раз

        int currentSum = 0;
        int res  = 0;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            if (prefixMap.containsKey(currentSum - k)) {
                res += prefixMap.get(currentSum - k);
            }
            prefixMap.put(currentSum, prefixMap.getOrDefault(currentSum, 0) + 1);

        }
    return res;
    }
}
