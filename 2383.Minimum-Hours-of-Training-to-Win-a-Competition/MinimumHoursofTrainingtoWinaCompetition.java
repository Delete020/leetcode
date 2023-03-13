/**
 * @author Delete020
 * @since 03/13/23 22:58 PM
 */
public class MinimumHoursofTrainingtoWinaCompetition {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int ans = 0;
        int n = energy.length;
        for (int i = 0; i < n; i++) {
            initialEnergy -= energy[i];
            if (initialExperience <= experience[i]) {
                ans += experience[i] - initialExperience + 1;
                initialExperience = experience[i] + 1;
            }
            initialExperience += experience[i];

        }
        ans -= initialEnergy <= 0 ? initialEnergy - 1 : 0;
        return ans;
    }
}