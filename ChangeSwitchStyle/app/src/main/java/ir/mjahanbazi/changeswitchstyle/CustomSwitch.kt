package ir.mjahanbazi.changeswitchstyle

import android.content.Context
import android.graphics.Color
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import android.graphics.drawable.StateListDrawable
import android.util.AttributeSet
import android.view.Gravity
import android.widget.Switch

class CustomSwitch : Switch {
    constructor(context: Context?) : super(context) {
        init()
    }

    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {
        init()
    }

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        init()
    }

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int) : super(context, attrs, defStyleAttr, defStyleRes) {
        init()
    }

    private fun init() {
        setPadding(15, 60, 15, 60)
        text = "Show products"
        setTextColor(Color.WHITE)
        setTextSize(15f)
        typeface = Typeface.DEFAULT_BOLD
        gravity = Gravity.CENTER
        switchMinWidth = 500
        isChecked = true
        switchPadding = 100
        setBackgroundColor(Color.GRAY)
        textOff = "Off"
        textOn = "On"
        showText = true
        setThumbDrawable(context.resources.getDrawable(R.drawable.thumb_off, null),
            context.resources.getDrawable(R.drawable.thumb_on, null))
        setTrackDrawable(context.resources.getDrawable(R.drawable.track_off, null),
            context.resources.getDrawable(R.drawable.track_on, null))
    }

    private fun setTrackDrawable(drawableOff: Drawable, drawableOn: Drawable) {
        val trackStates = StateListDrawable()
        trackStates.addState(intArrayOf(android.R.attr.state_checked), drawableOn)
        trackStates.addState(intArrayOf(), drawableOff)
        trackDrawable = trackStates
    }

    private fun setThumbDrawable(drawableOff: Drawable, drawableOn: Drawable) {
        val thumbStates = StateListDrawable()
        thumbStates.addState(intArrayOf(android.R.attr.state_checked), drawableOn)
        thumbStates.addState(intArrayOf(), drawableOff)
        thumbDrawable = thumbStates
    }
}
