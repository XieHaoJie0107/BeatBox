package xhj.zime.com.beatbox;

public class Sound {
    private String mAssetPath;
    private String mName;

    //一般都使用对象类型,如果值没有传入会自动填充为null,这个字段是soundPool预加载之后给的Id
    private Integer soundId;

    public Sound(String assetPath) {
        mAssetPath = assetPath;
        String[] components = assetPath.split("/");
        String fileName = components[components.length - 1];
        mName = fileName.replace(".wav", "");
    }


    public Integer getSoundId() {
        return soundId;
    }

    public void setSoundId(Integer soundId) {
        this.soundId = soundId;
    }

    public String getAssetPath() {
        return mAssetPath;
    }

    public String getName() {
        return mName;
    }
}
