package fishing.tackle.shop.ui.stapovi;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class StapoviViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public StapoviViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}