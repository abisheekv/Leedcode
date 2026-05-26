class Solution {
    public int numberOfBeams(String[] bank) {
        int prevDevices = 0;
        int beams = 0;

        for (String row : bank) {
            int currentDevices = 0;

            // Count devices in current row
            for (char ch : row.toCharArray()) {
                if (ch == '1') {
                    currentDevices++;
                }
            }

            // Ignore empty rows
            if (currentDevices > 0) {
                beams += prevDevices * currentDevices;
                prevDevices = currentDevices;
            }
        }

        return beams;
    }
}