package xhj.zime.com.beatbox;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BeatBoxFragment extends Fragment {

    public static BeatBoxFragment newInstance(){
        return new BeatBoxFragment();
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_beat_box,container,false);
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
