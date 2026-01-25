int counter = nums.length;
        int max  = 999999999;
        int min = -999999999;
        int[] new_arr = new int[nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] > min){
                min = nums[i];
            }
            if(nums[i] < max){
                max = nums[i];
            }
        }
        for(int i = max ; i <= min ; i++){
            new_arr[i] = i ;
        }