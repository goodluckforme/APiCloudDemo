package apicloud.com.youxian.di.module

import apicloud.com.youxian.mvp.contract.MeContract
import apicloud.com.youxian.mvp.model.MeModel
import com.jess.arms.di.scope.ActivityScope
import dagger.Module
import dagger.Provides


@Module
class MeModule
/**
 * 构建MeModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
 *
 * @param view
 */
(private val view: MeContract.View) {

    @ActivityScope
    @Provides
    internal fun provideMeView(): MeContract.View {
        return this.view
    }

    @ActivityScope
    @Provides
    internal fun provideMeModel(model: MeModel): MeContract.Model {
        return model
    }
}