<template>
  <div class="page-container md-layout-column">
    <md-toolbar class="md-primary">
      <md-button class="md-icon-button" @click="showNavigation = true">
        <md-icon>menu</md-icon>
      </md-button>
      <span class="md-title">MJU System </span>
    </md-toolbar>

    <md-drawer :md-active.sync="showNavigation">
      <md-toolbar class="md-transparent" md-elevation="0" :id="$style.navHeader">
        <span class="md-title">Navigation</span>
      </md-toolbar>

      <md-list>
        <md-list-item :class="$style.listItem">
          <md-icon>account_box</md-icon>
          <span class="md-list-item-text">직원 리스트</span>
        </md-list-item>

        <md-list-item :class="$style.listItem">
          <md-icon>description</md-icon>
          <span class="md-list-item-text">프로젝트 리스트</span>
        </md-list-item>

        <md-list-item :class="$style.listItem">
          <md-icon>assessment</md-icon>
          <span class="md-list-item-text">직원 평점 보기</span>
        </md-list-item>

        <md-list-item :class="$style.listItem">
          <md-icon>work</md-icon>
          <span class="md-list-item-text">투입 중 직원 보기</span>
        </md-list-item>
      </md-list>
    </md-drawer>
  </div>
</template>

<script>
const Component = {
  name: 'Sidenav',
  data() {
    return {
      showNavigation: false,
    };
  },
};

export default Component;
</script>

<style lang="scss" module>
#navHeader {
  border-bottom: 1px solid #d2d2d2;
}

.listItem {
  cursor: pointer;
}

</style>