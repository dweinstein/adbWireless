/**
 * siir.es.adbWireless.ManagePreferences.java
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

package siir.es.adbWireless;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;

@SuppressWarnings("unused")
public class ManagePreferences extends PreferenceActivity
{

	private CheckBoxPreference mPreferenceVibrate;
	private CheckBoxPreference mPreferenceSound;
	private CheckBoxPreference mPreferenceNoti;
	private CheckBoxPreference mPreferenceHaptic;
	private CheckBoxPreference mPreferenceWiFiOff;
	private CheckBoxPreference mPreferenceWiFiOn;
	
	private SharedPreferences mPreferences;

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.preferences);
		mPreferences = PreferenceManager.getDefaultSharedPreferences(this);
		mPreferenceVibrate = (CheckBoxPreference) findPreference(getResources().getString(R.string.pref_vibrate_key));
		mPreferenceSound = (CheckBoxPreference) findPreference(getResources().getString(R.string.pref_sound_key));
		mPreferenceNoti = (CheckBoxPreference) findPreference(getResources().getString(R.string.pref_noti_key));
		mPreferenceHaptic = (CheckBoxPreference) findPreference(getResources().getString(R.string.pref_haptic_key));
		mPreferenceWiFiOff = (CheckBoxPreference) findPreference(getResources().getString(R.string.pref_wifi_off_key));
		mPreferenceWiFiOn = (CheckBoxPreference) findPreference(getResources().getString(R.string.pref_wifi_on_key));
		
	}
}